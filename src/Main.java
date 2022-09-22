public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter your party affiliation (D--democrat, R-republican, I-independent): ");
        String partyAffiliation="m";
        System.out.println(partyAffiliation);

        if (partyAffiliation.equalsIgnoreCase("D"))
        {
            System.out.println("You are a democratic donkey!");
        }

        else if (partyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("You are a republican elephant!");
        }

        else if (partyAffiliation.equalsIgnoreCase("I"))
        {
            System.out.println("You are an independent man!");
        }

        else
        {
            System.out.println("You are affiliated with some other party!");
        }

    }
}