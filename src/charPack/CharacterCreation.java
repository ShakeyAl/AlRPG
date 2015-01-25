package charPack;

public class CharacterCreation {
  
  String name, charClass;
  int level, experience, gold, strength, intelligence, vitality, dexterity, health, mana, ap, mp, def;
  
  public CharacterCreation(){
    level = 1; experience = 0; gold = 0; strength = 10; intelligence = 10;
    vitality = 10; dexterity = 10; health = 100; mana = 50; ap = 20; mp = 20; def = 10;
  }
  
  public void setClass(){
    // what class would you like?
    // get class and set charClass to it
    charClass = "Warrior";
  }
  public void setName(){
    // Ask what to name character set nameVariable to selection
    name = "Duke"
  }
  
  public void confirmChar(){
    // Name and Class, ask user if they're sure
    // if they say yes write entry into database and return up
    // if they say no ask them for class selection and name again.
  }
  
}
