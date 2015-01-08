class Prob {
    public Prob() {}

    public static Prob Prob() {
	return new Prob();
    }

    public static class Inner {}

    public Prob.Inner foo(java.util.List<Prob.Inner> list) {
	return new Prob.Inner();
    }
}
