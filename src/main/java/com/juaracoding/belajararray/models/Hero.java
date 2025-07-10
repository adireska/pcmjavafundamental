package com.juaracoding.belajararray.models;

public class Hero {
    private String name;
  private int hp;
  private String skillName;
  private int damage;

  public Hero(String name, int hp, int damage, String skillName) {
    this.name = name;
    this.hp = hp;
    this.damage = damage;
    this.skillName = skillName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    if (hp <= 100 && hp != 0) {
      this.hp = hp;
    }
  }

  public String getSkillName() {
    return skillName;
  }

  public void setSkillName(String skillName) {
    this.skillName = skillName;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    if (damage < 100 && damage != 0) {
      this.damage = damage;
    }
  }
}
