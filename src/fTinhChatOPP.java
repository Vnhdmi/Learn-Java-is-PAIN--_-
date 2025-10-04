class tcEncapsulation {
    private String name;
    private String Job;

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void getInfo() {
        System.out.printf("print info\n %s, %s", getName(), getJob());
    }

}

class tcInhertiance {
    void jd() {
        System.out.println("Dev make a program ");
    }
}

class subOfInhertiance extends tcInhertiance {
    void jd1() {
        System.out.println("No, we make the word ");
    }
}

class tcPolymorphism {
    void sayHello() {
        System.out.println("iI from void");
    }
}
abstract class tcAbstraction {
    abstract    void draw ();
}
class sbOFAbstraction extends tcAbstraction {
    @Override
    void draw() {
        //draw shape by print command
        System.out.println("***********");
    }
}

public class fTinhChatOPP extends tcPolymorphism {
    void sayHello() {
        System.out.println("I from VN ");
    }

    public static void main(String[] args) {
        tcEncapsulation nCapsun = new tcEncapsulation();
        subOfInhertiance sub = new subOfInhertiance();
        tcPolymorphism daHinh = new fTinhChatOPP();
        sbOFAbstraction Abstraction = new sbOFAbstraction() ;
        nCapsun.setName("Huy");
        nCapsun.setJob("Dev");
        nCapsun.getInfo();
        sub.jd();
        sub.jd1(); // co the nhan phan tu ca lop CON va CHA
        Abstraction.draw();
        //Da hinh
        daHinh.sayHello();


    }

}
