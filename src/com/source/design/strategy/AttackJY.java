package com.source.design.strategy;

/**
 * @Author LiuYang
 * @Date 2020/8/6/006  16:40
 * @Version 1.0
 **/
public class AttackJY implements IAttackBehavior {

  @Override
  public void attack() {
    System.out.println("九阳神功！");
  }
}
