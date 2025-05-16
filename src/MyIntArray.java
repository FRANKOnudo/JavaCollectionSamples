
public class MyIntArray {

  int[] v;
  int len, size, delta;

  public MyIntArray( int startSize, int deltaSize ) {
    size = ( startSize<=0 ? 100 : startSize );
    v = new int[size];
    len = 0;
    delta = ( deltaSize<=0 ? 10 : deltaSize );
  }

  public MyIntArray() {
    this(100, 10);
  }

  public void add( int newValue ) {
    if (len>=size) {
      // il nostro array è sold-out
      int[] nuovoV = new int[size + delta];
      for (int i=0; i<len; i++) nuovoV[i]=v[i];
      v = nuovoV;
      size += delta;
    }
    v[len++] = newValue;
  }
  public void addHead( int newValue ) {
    if (len>=size) {
      // il nostro array è sold-out
      int[] nuovoV = new int[size + delta];
      for (int i=0; i<len; i++) nuovoV[i]=v[i];
      v = nuovoV;
      size += delta;
    }
    v[len++] = newValue;
  }

    @Override
    public String toString() {
      String s = "Sono grande " + size + " e contengo " + len + " valori: ";
      for (int i=0; i<len; i++) s += v[i] + " ";
      return s;
    }
  
  
}
