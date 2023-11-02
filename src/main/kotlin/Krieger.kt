class Krieger(name: String, maxHp: Int) : Hero(name, maxHp) {

    init {
        actions = listOf(
            Action("Hit", 20),
            Action("Protective Spell", 0)
        )
    }

}