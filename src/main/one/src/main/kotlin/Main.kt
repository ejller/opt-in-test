package nekek

import kek.DataClass

fun test(d: DataClass) {
    // K1: OK, but should be OPT_IN_USAGE_ERROR
    // K2: OPT_IN_USAGE_ERROR
    val (x) = d
    // K1: OK, but should be OPT_IN_USAGE_ERROR
    // K2: OPT_IN_USAGE_ERROR
    val c = d.component1()
}