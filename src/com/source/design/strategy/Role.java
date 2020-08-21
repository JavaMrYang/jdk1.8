package com.source.design.strategy;

/**
 * @Author LiuYang
 * @Date 2020/8/6/006  16:30
 * @Version 1.0
 **/
public abstract class Role {

  protected String name;

  protected IDisplayBehavior displayBehavior;

  protected IRunBehavior runBehavior;

  protected IDefendBehavior defendBehavior;

  protected IAttackBehavior attackBehavior;

  public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
    this.displayBehavior = displayBehavior;
    return this;
  }

  public Role setRunBehavior(IRunBehavior runBehavior) {
    this.runBehavior = runBehavior;
    return this;
  }

  public Role setDefendBehavior(IDefendBehavior defendBehavior) {
    this.defendBehavior = defendBehavior;
    return this;
  }

  public Role setAttackBehavior(IAttackBehavior attackBehavior) {
    this.attackBehavior = attackBehavior;
    return this;
  }

  protected void display(){
    displayBehavior.display();;
  };

  protected  void  run(){
    runBehavior.run();
  };

  protected  void attack(){
    attackBehavior.attack();;
  };

  protected  void defend(){
    defendBehavior.defend();
  };
}
