package com.source.design.strategy;

/**
 * @Author LiuYang
 * @Date 2020/8/6/006  16:52
 * @Version 1.0
 **/
public class StrategyTest {

  public static void main(String[] args) {
    Role roleA=new RoleA("A");

    roleA.setAttackBehavior(new AttackJY()).setDefendBehavior(new DefendTBS())
        .setDisplayBehavior(new DisplayA()).setRunBehavior(new RunJCTQ());

    System.out.println(roleA.name+"");

    roleA.run();
    roleA.attack();
    roleA.defend();
    roleA.display();
  }
}
