/*V etom klasse opredelyaetsya celochislenniy stek, v kotorom
mojno hranit do 10 celochislennyh znacheniy
 */
class Stack {
    int stck[] = new int[10]; //stek celochislennyh znacheniy hranitsa v massive stck
    int tos; // stek indeksiruetsya peremennoy tos s indeksom vershiny steka

    //inicializiruem vershinu steka
    Stack() {
        tos = -1; // nash stek pust
    }

    //razmeschaem element v steke
    void push(int item) {
        if(tos==9)
            System.out.println("Stek zapolnen.");
        else
            stck[++tos] = item;
    }

    //izvlech element iz steka
    int pop() {
        if (tos < 0) {
            System.out.println("Stek ne zagrujen.");
            return 0;
        } else
            return stck[tos--];

    }

}
