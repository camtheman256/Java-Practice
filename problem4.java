class Problem4 {
  public static void main(String[] args) {
    String output;
    String outputReverse;
    int highest = 0;
    int current;
    for(int i = 1; i <= 999; i++) {
      for(int j = 1; j <= 999; j++) {
        output = i * j + "";
        outputReverse = new StringBuilder(output).reverse().toString();
        if(output.equals(outputReverse)) {
          current = i * j;
          if(current > highest) {
            highest = current;
            System.out.println(highest);
          }
        }
      }
    }
  }
}
