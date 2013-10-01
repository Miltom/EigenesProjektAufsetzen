Aufgabe
*******

Wie wird die Zusammenarbeit im Hinblick auf Source Control geregelt? 
-> Mit Github

Welches ist das geeignet Build Tool fuer das Projekt?
-> Maven
 
Wie wird sichergestellt, dass alle Gruppenmitglieder das Projekt kompilieren koennen?
-> Wenn man ein kompilierbares Projekt auf Github hochlädt, können die Gruppenmitglieder
   diesen kompilierbares Projekt von Github herunterholen und es kompilieren und daran arbeiten.

Wie wird sichergestellt, dass alle Gruppenmitglieder die noetigen 3rd Party Libraries installiert haben?
-> Mit Maven. Weil man unter <dependency>...</dependency> (im pom.xml)  diesen Library hinzufügt. Dabei werden alle Mitglieder
   diese auch haben. 