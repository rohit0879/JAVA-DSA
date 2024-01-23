public class Familly_Inhe {
    public static void main(String args[]){

        Parents PB = new Parents();
        System.out.println("about my Parents");
        PB.age=45;
        System.out.println("age : "+PB.age);
        PB.eduction(); 

        System.out.println("======================================");

        System.out.println("about my elder broher");
        elderBrother rahul = new elderBrother();
        rahul.Ability();
        rahul.Responsibility();
        rahul.age = 27;
        System.out.println("age : "+rahul.age);

        System.out.println("========================================");
        System.out.println("about me");
        Me rohit = new Me();
        rohit.Responsibility(); 
        rohit.graduation();
        rohit.l_education();
        rohit.Nature();
        rohit.degree();
        rohit.age = 23;
        System.out.println("age : "+rohit.age);

        System.out.println("========================================");
        younger robin =new younger();
        robin.Ability();
        robin.nature();
        robin.future();
        robin.l_education();
        robin.age = 20;
        System.out.println("age : "+robin.age);
    }
}

class Parents{
    int age;
    void Responsibility(){
        System.out.println("very responsibility person");
    }

    void eduction(){
        System.out.println("Qualification is very good");
    }

    void Ability(){
        System.out.println("his has ability to do every thing");
    }
}

class elderBrother extends Parents{
       void l_education(){
        System.out.println("KIIT");
       }

       int height;

       void attractive(){
        System.out.println("Very attractive nature");
       }
}

class Me extends elderBrother{
    void graduation(){
        System.out.println("University of Allahabad");
    } 
    
    void degree(){
        System.out.println("MCA");
    }
    void Nature(){
        System.out.println(" very versatile nature");
    }
}

class younger extends Parents{
    void l_education(){
        System.out.println("BA");
    }
    void future(){
        System.out.println("actor");
    }
    void nature(){
        System.out.println("out standing nature");
    }
}
