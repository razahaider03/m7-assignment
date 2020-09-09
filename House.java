/** This is the House class file that extends Building. */
public class House extends Building {

  // TODO - Put your code here.
  private String mOwner;
  private boolean mPool;

  public House(int length, int width, int lotLength, int lotWidth) {
      super(length,width,lotLength,lotWidth);
  }

  public House(int length, int width, int lotLength, int lotWidth, String owner) {
      super(length,width,lotLength,lotWidth);
      this.mOwner = owner;
  }

  public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
     super(length,width,lotLength,lotWidth);
     this.mOwner = owner;
     this.mPool = pool;
  }

  public String getOwner() {
      return this.mOwner;
  }

  public boolean hasPool() {
      return this.mPool;
  }

  public void setOwner(String name) {
      this.mOwner = name;
  }

  public void setPool(boolean bool) {
      this.mPool = bool;
  }

  public String toString() {
      return "house has big space " +super.calcBuildingArea();
  }

  public boolean equals(Object obj) {
      if (obj instanceof House){
          House s = (House)obj;
          return (super.equals(s) && this.calcBuildingArea() == s.calcBuildingArea() && this.hasPool() == s.hasPool());
  }
      return false;
  }
}
