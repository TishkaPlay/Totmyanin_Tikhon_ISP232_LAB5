package characters

import world.Quest
import world.QuestType

fun main() {
/*    val hero1 = Hero("Артур", "мужской", "оружейник", 4, "Вода", 30, 30)
    println("Герой жив? - ${hero1.isAlive()}")
    val easyQuest = Quest("Сбор трав",2,100,"лёгкий")
    val hardQuest = Quest("Охота на дракона", 10, 1000, "сложный")
    val hero2 = Hero("Артур", "мужской", "оружейник", 4, "Вода", 0, 50)
    println("Герой жив? - ${hero2.isAlive()}")

    hero1.canAcceptQuest(easyQuest)
    hero2.canAcceptQuest(hardQuest)

    val enemy1 = Enemy("Гоблин", 30, "Огонь")
    println(enemy1.getThreatLevel())
    val enemy2 = Enemy("Орк", 100, "Вода")
    println(enemy2.getThreatLevel())
    val enemy3 = Enemy("Дракон", 200, "Пыль")
    println(enemy3.getThreatLevel())
    val enemy4 = Enemy("Тишка", -2100, "Земля")
    println(enemy4.getThreatLevel())


    val naruto: characters.Hero = characters.Hero("Наруто", gender = "мужской", "Шиноби", 5,"Ветер",150,200)
    naruto.showStats()
    val kakashi: characters.Hero = characters.Hero("Какаши","мужской", "Шиноби",15,"Молния",250,300)
    kakashi.showStats()
    val orochimaru: characters.Enemy = characters.Enemy("Орочимару", 350, "Ветер")
    naruto.castSpellOn(orochimaru, "Расенган", 30)
    naruto.duel(kakashi)

    println("Наруто увидел врага ${orochimaru.name}! Его здоровье - ${orochimaru.hp}")
    naruto.attack(orochimaru, 25)

    val naruto: characters.Hero = characters.Hero()
    naruto.name = "Наруто Узумаки"
    naruto.gender = "Мужской"
    naruto.role = "Хокаге"
    naruto.hp = 200
    naruto.mp = 150
    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
    println()
    val sasuke: characters.Hero = characters.Hero()
    sasuke.name = "Саске Учиха"
    sasuke.gender = "Мужской"
    sasuke.role = "Шиноби-отступник"
    sasuke.hp = 120
    sasuke.mp = 180
    println("Имя: ${sasuke.name} \nПол: ${sasuke.gender} \nКласс: ${sasuke.role}\nЗдоровье: ${sasuke.hp}\nМана: ${sasuke.mp}")
    println()
    val godjo: characters.Hero = characters.Hero()
    godjo.name = "Годжо Сатору"
    godjo.gender = "Мужской"
    godjo.role = "Маг Проклятий"
    godjo.hp = 160
    godjo.mp = 300
    println("Имя: ${godjo.name} \nПол: ${godjo.gender} \nКласс: ${godjo.role}\nЗдоровье: ${godjo.hp}\nМана: ${godjo.mp}")
    println()

    val hero: characters.Hero = characters.Hero()
    hero.takeDamage(30)
    hero.takeDamage(20)
    hero.greet(name = hero.name)
    hero.greet(name = "Наруто")
    println("Введите имя героя: ")
    hero.name = readln()
    println("Введите пол героя: ")
    hero.gender = readln()
    println("Введите класс героя: ")
    hero.role = readln()
    println("Введите здоровье героя: ")
    hero.hp = readln().toInt()
    println("Введите ману героя: ")
    hero.mp = readln().toInt()
    println("Введите уровень героя:")
    hero.lvl = readln().toInt()
    println("Введите стихию героя: ")
    hero.st = readln()
    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role}\nЗдоровье: ${hero.hp}\nМана: ${hero.mp}\nУровень: ${hero.lvl}\nСтихия: ${hero.st}")

    hero.sayHello()
    hero.showStats()
    hero.meditate()
    hero.castSpell()
    hero.heal()
    hero.die()

//Лаба 7
    val blacksmith = NPC("Кузнец Ульфрик", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()


    val dragon = Boss("Алдуин", 500, "Огонь", phaseCount = 4, true)
    dragon.startPhase(2)
    println(dragon.dropLoot())
    dragon.takeDamage(150)

    val enemy: GameCharacter = Enemy("Джин")
    val hero: GameCharacter = Hero("Наруто")
    val npc: GameCharacter = NPC("Торговец")

    (enemy as Enemy).takeDamage(20)
    enemy.takeDamage(20)
    println(enemy.name)
*/
    val trader = Trader("Ральф")

    trader.addQuest(Quest("Собрать травы", 2, 50, "Лёгкий", QuestType.DELIVERY))
    trader.addQuest(Quest("Убить волков", 3, 100, "Средний", QuestType.ELIMINATION))

    trader.showAvailableQuests()

    val selectQuest = trader.giveQuest(1)
    selectQuest.describe()
}