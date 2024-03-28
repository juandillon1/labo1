public class B extends  A {
    private double zzz;

    public B(int a, String b, boolean c) {
        super(a, b, c);
    }

    public B(int a, String b, boolean c, double zzz) {
        super(a, b, c);
        this.zzz = zzz;
    }

    public double getZzz() {
        return zzz;
    }

    public void setZzz(double zzz) {
        this.zzz = zzz;
    }
}
