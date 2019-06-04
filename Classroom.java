class Classroom {

    public static void main(String[] args) {
        
        Wilder clement = new Wilder("Clément", true);
        Wilder romain = new Wilder("Romain", false);

        System.out.println(clement.whoAmI());
        System.out.println(romain.whoAmI());

        clement.isAware(false);
        romain.isAware(true);

        System.out.println("Je viens de changer l'état de " + clement.getFirstName() + " maintenant c'est : " + String.valueOf(clement.isAware()));
        System.out.println("Je viens de changer l'état de " + romain.getFirstName() + ", maintenant c'est : " + String.valueOf(romain.isAware()));

        System.out.println(clement.whoAmI());
        System.out.println(romain.whoAmI());

        clement.getFirstName("Vincent");

        System.out.println("Le prénom de Clément est maintenant : " + clement.getFirstName());

    }

}