class problem1 {
  public static void main(String[] args) {
    int addition = 0;
    int[] divisibleBy3or5 = new int[999];
    for(int i = 1; i < 1000; i++) {
      if(i % 3 == 0 || i % 5 == 0) {
        divisibleBy3or5[i-1] = i;
      }
    }
    for(int j = 0; j < 999; j++) {
      addition += divisibleBy3or5[j];
    }
    System.out.println(addition);
  }
}
