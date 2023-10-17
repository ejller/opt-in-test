package kek

@kotlin.RequiresOptIn
@Target(AnnotationTarget.PROPERTY)
annotation class Marker

data class DataClass(@property:Marker val x: Int)
