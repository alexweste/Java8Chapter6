/* V dannoy programme sozdayutsya dva celochislennyh steka, v kajdom iz kotoryh snachala razmeschayusa,
a zatem izvlekayutsya celochislennye znacheniya
 */
public class TestStack {
    public static void main(String[] atgs){
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // razmeschaem chisla v steke
        for(int i=0; i<11; i++) mystack1.push(i);
        for(int i=10; i<21; i++) mystack2.push(i);

         // izvlekaem zadannye chisla iz steka
            System.out.println("Soderjimoe steka mystack1:");
            for(int i=0; i<11; i++)
                System.out.println(mystack1.pop());

            System.out.println("Soderjimoe steka mystack2:");
            for(int i=0; i<11; i++)
                System.out.println(mystack2.pop());

    }
}
