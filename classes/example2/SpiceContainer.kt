package spices

// it is useful to hold data and setter and getters methods are override
data class SpiceContainer (val spice: Spice) {
    val label: String = spice.name
}