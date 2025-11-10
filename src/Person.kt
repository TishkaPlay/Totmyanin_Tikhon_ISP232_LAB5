/*fun main() {
    val naruto: Hero = Hero()
    naruto.name = "Наруто"
    naruto.role = "Шиноби"
    naruto.st = "Ветер"
    naruto.mp = 100

    val kakashi: Hero = Hero()
    kakashi.name = "Какаши"
    kakashi.role = "Шиноби"
    kakashi.st = "Молния"
    kakashi.mp = 100

    val orochimaru: Enemy = Enemy()
    orochimaru.name = "Орочимару"
    orochimaru.st = "Ветер"

    naruto.castSpellOn(orochimaru, "Расенган", 30)
    naruto.duel(kakashi)

    println("Наруто увидел врага ${orochimaru.name}! Его здоровье - ${orochimaru.hp}")
    naruto.attack(orochimaru, 25)

    val naruto: Hero = Hero()
    naruto.name = "Наруто Узумаки"
    naruto.gender = "Мужской"
    naruto.role = "Хокаге"
    naruto.hp = 200
    naruto.mp = 150
    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
    println()
    val sasuke: Hero = Hero()
    sasuke.name = "Саске Учиха"
    sasuke.gender = "Мужской"
    sasuke.role = "Шиноби-отступник"
    sasuke.hp = 120
    sasuke.mp = 180
    println("Имя: ${sasuke.name} \nПол: ${sasuke.gender} \nКласс: ${sasuke.role}\nЗдоровье: ${sasuke.hp}\nМана: ${sasuke.mp}")
    println()
    val godjo: Hero = Hero()
    godjo.name = "Годжо Сатору"
    godjo.gender = "Мужской"
    godjo.role = "Маг Проклятий"
    godjo.hp = 160
    godjo.mp = 300
    println("Имя: ${godjo.name} \nПол: ${godjo.gender} \nКласс: ${godjo.role}\nЗдоровье: ${godjo.hp}\nМана: ${godjo.mp}")
    println()

    val hero: Hero = Hero()
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

}*/