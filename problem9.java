class problem9 {
  public static void main(String[] args) {
    boolean notEqualYet = true;
    int counter = 1;
    int counter2 = 1;
    double counter3 = 0;
    while(notEqualYet) {
        while(notEqualYet && counter2 <= 1000) {
          counter2 +=1;
          counter3 = Math.sqrt(Math.pow(counter, 2) + Math.pow(counter2, 2));
          double quickval = counter + counter2 + counter3;
          if(quickval == 1000) {
            notEqualYet = false;
          }
        }
        double answer = counter * counter2 * counter3;
        System.out.println("answer: " + answer);
        counter2 = 1;
        counter += 1;
    }
  }
}
