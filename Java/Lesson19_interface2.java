
interface Superhero {

        void heroName();
        void secretIdentity();
        void HeroDetails();
	    void Movie();
    
}


class Captain_America  implements Superhero{

    public void heroName() {
        System.out.println("This superhero name is Captain America haahha");
    };

    public void secretIdentity() {
        System.out.println("His secret identity is Steve Roger");
    };

    public void HeroDetails() {
        System.out.println("Joined in : Avengers #4 (March 1964) ");
    };

    public void Movie() {
        System.out.println("Deatils : \n Given retroactive founding member status in place of the Hulk. Former leader of the Avengers Unity Division and the Black Ops Secret Avengers, as well as former member of the New Avengers. Current member of the main Avengers team. ");

    };

}






class Lesson19_interface2 {


    public static void main(String[] args) {
        
        Captain_America kapten1 = new Captain_America();
        kapten1.heroName();
        kapten1.secretIdentity();
        kapten1.HeroDetails();
        kapten1.Movie();


        ScarletWitch scarlet1 = new ScarletWitch();
        scarlet1.heroName();
        scarlet1.secretIdentity();
        scarlet1.HeroDetails();
        scarlet1.Movie();

    }
}



class ScarletWitch implements Superhero{

    public void heroName() {
        System.out.println("Hero Name : Scarlet Witch ");
    };

    public void secretIdentity() {
        System.out.println("Secret Identitiy: Wanda Maximoff ");
    };

    public void HeroDetails() {
        System.out.println("Joined in : Avengers #16 (May 1965) ");
    };

    public void Movie() {
        System.out.println("Deatils : \n Former member of the Brotherhood of Evil Mutants, the Avengers Unity Division, Pym's Mighty Avengers, the West Coast Avengers, and Avengers Academy. Former member of the main Avengers team. ");
    };
}