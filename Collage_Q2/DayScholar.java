package Collage_Q2;

public class DayScholar extends Student {
    
        private double transpostFee;

        public DayScholar() {
            this.transpostFee = transpostFee;
        }

        public double getTranspostFee() {
            return transpostFee;
        }

        public void setTranspostFee(double transpostFee) {
            this.transpostFee = transpostFee;
        }

        @Override
        public double payfee() {
            // TODO Auto-generated method stub
            // return super.payfee();
            Hosteller ds = new Hosteller();
            double examFee = ds.getExamFee();

            return examFee+this.transpostFee;
        }

      

        
    }

   
    

