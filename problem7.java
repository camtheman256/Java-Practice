class Problem7 {
  public static int[] primes = new int[10001];
  public static void main(String[] args) {
    int current = 2;
    Problem7 method = new Problem7();
    while(primes[10000] == 0) {
      method.isPrime(current);
      current++;
    }
    System.out.println(primes[10000]);
    //Figured out what i was doing wrong. because i had < in line 21,
    //next to Math.sqrt it included perfect squares! i feel stupid now.
    //and if you wanted to know, I looked up quad. sieve but it was super
    //complicated, so I opted for something I understand.
  }
  private void isPrime(int number) {
    int counter = 0;
    boolean isItPrime = true;
    int iterator = 0;
    int dividend = 1;
    while(counter <= 10000 && (primes[counter] <= Math.sqrt(number))) {
      if(primes[counter] != 0) {
        dividend = number % primes[counter];
      }
      if(dividend == 0) {
        isItPrime = false;
      }
      counter++;
    }
    if(isItPrime == true) {
      while(primes[iterator] != 0) {
        iterator++;
      }
      primes[iterator] = number;
      System.out.println(number);
      return;
    }
  }
}
