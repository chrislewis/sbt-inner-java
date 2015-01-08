object Caller {
  def dothings() = {
    val p = new Prob()
    p.foo(new java.util.ArrayList[Prob.Inner])
  }
}
