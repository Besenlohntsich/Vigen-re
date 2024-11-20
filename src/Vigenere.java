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
        public void verschluesseln () {
            String result = "";



            for (int i = 0; i < kt.length(); i++) {
            //Wir gehen durch den Array
                char Zs = (s.charAt(s.charAt(i)));
                //Zs soll der Ascii wert des schlüssels sein

                char ch = Character.toUpperCase(kt.charAt(i));
                //buchstaben werden zuerst in Großbuchstaben verwandelt

                if (Character.isUpperCase(ch)) {
                    ch = zahlenZuBuchstaben((buchstabenZuZahlen(ch) - buchstabenZuZahlen(Zs) + 26) % 26);
                }

                result += ch;
            }

            gt = result;

        }

        public void entschluesseln()
        {


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
