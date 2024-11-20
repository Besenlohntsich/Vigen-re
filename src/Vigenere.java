public class Vigenere {


    private String kt;

    private String s;

    private String gt;


    public Vigenere()
    {

        this.gt = "";
        this.kt = "";
        this.s ="";

    }


         //nur großbuchstaben werden verschlüsselt
         //nur großbuchstaben werden verschlüsselt
         public void verschluesseln() {

             String result = "";

             int schluesselLaenge = s.length();
             //Schlüssellänge des Schlüssels

             for (int i = 0; i < kt.length(); i++) {
                 //Wir gehen durch den Array
                 char Zs = Character.toUpperCase(s.charAt(i % schluesselLaenge));
                 //Zs ist der schlüsselbuchstabe als zahl welcher
                 // zyklisch wiederholt werden soll, wenn er kürzer ist als der zu verschlüsselnde Text

                 char ch = Character.toUpperCase(kt.charAt(i));
                 //buchstaben werden zuerst in Großbuchstaben verwandelt

                 if (Character.isLetter(ch))
                 //wenn es ein Buchstabe ist
                 {
                     ch = zahlenZuBuchstaben((buchstabenZuZahlen(ch) + buchstabenZuZahlen(Zs)) % 26);
                     //Schlüssel wird durch die Zahl der Buchstaben addiert und mod 26 "begrentzt"
                     // um Buchstaben zu nutzen die im Alphabet liegen
                 }

                 result += ch;
             }

             gt = result;
         }

        public void entschluesseln()
        {
            String result = "";

            int schluesselLaenge = s.length();
            //Schlüssellänge des Schlüssels

            for (int i = 0; i < gt.length(); i++) {
                //Wir gehen durch den Array
                char Zs = Character.toUpperCase(s.charAt(i % schluesselLaenge));
                //Zs ist der schlüsselbuchstabe als zahl welcher
                // zyklisch wiederholt werden soll, wenn er kürzer ist als der zu verschlüsselnde Text

                char ch = Character.toUpperCase(gt.charAt(i));
                //buchstaben werden zuerst in Großbuchstaben verwandelt

                if (Character.isLetter(ch))
                //wenn es ein Buchstabe ist
                {
                    ch = zahlenZuBuchstaben((buchstabenZuZahlen(ch) - buchstabenZuZahlen(Zs)) % 26);
                    //Schlüssel wird durch die Zahl der Buchstaben addiert und mod 26 "begrentzt"
                    // um Buchstaben zu nutzen die im Alphabet liegen
                }

                result += ch;
            }

            kt = result;
        }





        private int buchstabenZuZahlen(char pWert)
        {

        return pWert - 'A';
        }

        private char zahlenZuBuchstaben(int pWert)
        {
        return (char) (pWert + 'A');

        }
        public String getGt ()
        {
            return gt;
        }

        public void setGt (String gt)
        {
            this.gt = gt;
        }

        public String getS ()
        {
            return s;
        }

        public void setS (String s)
        {
            this.s = s;
        }

        public String getKt ()
        {
            return kt;
        }

        public void setKt (String kt)
        {
            this.kt = kt;
        }
    }
