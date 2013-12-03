package genericBeispiel;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import javax.swing.*;

public class SwingWorkerBeispiel extends JFrame {

	Random random = new Random();
	JButton start = new JButton("Start"); // Knopf zum Starten der SwingWorker
	JTextArea progress = new JTextArea(20, 10); // Textfeld für
												// Zwischenergebnisse
	JTextArea result = new JTextArea(10, 20); // Textfeld für Endergebnisse
	static int count = 1;

	public SwingWorkerBeispiel() {
		super("SwingWorkerBeispiel");

		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startWorker("Worker " + (count++), 10);
			}
		});
		setLayout(new BorderLayout());
		add(start, BorderLayout.NORTH);
		add(new JScrollPane(progress), BorderLayout.CENTER);
		add(new JScrollPane(result), BorderLayout.EAST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	/**
	 * Job mit SwingWorker starten.
	 * 
	 * @param name
	 *            Name für den SwingWorker
	 * @param n
	 *            Argument für Fibonacci-Funktion
	 */
	void startWorker(final String name, final int n) {
		// Der SwingWorker führt eine lang andauernde Aktion aus, die mit
		// GUI-Komponenten interagieren soll.
		// 1. Typparameter: Typ des Endergebnisses, das vom Worker berechnet
		// wird
		// 2. Typparameter: Typ der Zwischenergebnisse, die der Worker
		// veröffentlichen will.
		SwingWorker<Integer, String> worker = new SwingWorker<Integer, String>() {

			// Job wird in eigenem Thread ausgeführt. Hier dürfen keine
			// Manipulationen
			// an Swing-Komponenten stattfinden.
			@Override
			protected Integer doInBackground() throws Exception {
				int result = 0;
				for (int i = 1; i <= n; i++) {
					result = fibonacci(i);
					// Zwischenergebnis veröffentlichen. Die publish()
					// übergebenen
					// Objekte werden von der process()-Methode empfangen.
					publish(String.format("%s (%d von %d)=%d", name, i, n, result));
				}
				// Endergebnis zurückliefern. Das Endergebnis kann in der
				// done()-Methode
				// durch Aufruf von get() abgerufen werden. Siehe unten.
				return result;
			}

			// Durch publish() veröffentliche Zwischenergebnisse behandeln.
			// process() wird innerhalb des EDT aufgerufen. Hier können
			// Manipulationen
			// an GUI-Elementen sicher vorgenommen werden.
			@Override
			protected void process(List<String> chunks) {
				progress.append(chunks.get(0));
				progress.append("\n");
			}

			// Worker hat seinen Job beendet. done() wird innerhalb des EDT
			// aufgerufen.
			// Hier können Manipulationen an GUI-Elementen sicher vorgenommen
			// werden.
			@Override
			protected void done() {
				try {
					Integer ergebnis = get(); // Endergebnis aus
												// doInBackground() holen.
					result.append("Ergebnis von " + name + "= " + ergebnis + "\n");
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				} catch (ExecutionException e) {
					throw new RuntimeException(e);
				}
			}
		};

		worker.execute();
	}

	int fibonacci(int n) {
		try {
			Thread.sleep(random.nextInt(50));
		} catch (InterruptedException e) {
		}

		if (n <= 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	// ======================================================

	public static void main(String... args) {
		new SwingWorkerBeispiel().setVisible(true);
	}
}