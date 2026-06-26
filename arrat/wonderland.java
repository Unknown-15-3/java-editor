package arrat;

class wonder{
    void location(){
        System.out.println("The location of the 7 wonders are: ");
    }
    void famous(){
        System.out.println("They are famous for");
    }
}

class taj_mahal extends wonder{
    void location() {
        System.out.println("The location of taj mahal is in india");
    }

    void famous() {
        System.out.println("A white marble mausoleum built in memory of Mumtaz Mahal");
}
}

class great_wall_of_china extends wonder {
    void location() {
        System.out.println("The location of great wall of china is china");
    }

    void famous() {
        System.out.println("A massive wall built to protect against invasions.");
    }
}

class Machu_Picchu extends wonder {
    void location() {
        System.out.println("The location of Machu Picchu is Peru");
    }

    void famous() {
        System.out.println("An ancient Incan city set high in the Andes Mountains.");
    }
}

class Petra extends wonder {
    void location() {
        System.out.println("The location of petra is in Jordan");
    }

    void famous() {
        System.out.println("An archaeological city famous for its rock-cut architecture.");
    }
}

class Christ_the_Redeemer extends wonder {
    void location() {
        System.out.println("The location of Christ the Redeemer is in Brazil");
    }

    void famous() {
        System.out.println("A statue of Jesus Christ overlooking Rio de Janeiro.");
    }
}

class Chichen_Itza extends wonder {
    void location() {
        System.out.println("The location of Chichen Itza is in Mexico");
    }

    void famous() {
        System.out.println("A large pre-Columbian archaeological site built by the Maya civilization.");
    }
}

class Roman_Colosseum extends wonder {
    void location() {
        System.out.println("The location of Roman Colosseum is in Italy");
    }

    void famous() {
        System.out.println(" An ancient amphitheater in the center of Rome.");
    }
}

public class wonderland {
    public static void main(String[] args) {
        wonder obj = new wonder();
        wonder obj1 = new Chichen_Itza();
        wonder obj2 = new Christ_the_Redeemer();
        wonder obj3 = new Machu_Picchu();
        wonder obj4 = new Petra();
        wonder obj5 = new Roman_Colosseum();
        wonder obj6 = new taj_mahal();
        wonder obj7 = new great_wall_of_china();
        obj.location();
        obj.famous();

        obj1.location();
        obj1.famous();

        obj2.location();
        obj2.famous();

        obj3.location();
        obj3.famous();

        obj4.location();
        obj4.famous();

        obj5.location();
        obj5.famous();

        obj6.location();
        obj6.famous();

        obj7.location();
        obj7.famous();
    }
}
