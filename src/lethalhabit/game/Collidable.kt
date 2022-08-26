package lethalhabit.game

import lethalhabit.hitbox.Hitbox
import lethalhabit.util.Point

interface Collidable: GameObject {
    val hitbox: Hitbox
    val leftSide: Point get() = hitbox.points.minByOrNull { it.x }!!
    val rightSide: Point get() = hitbox.points.maxByOrNull { it.x }!!
    val lowerSide: Point get() = hitbox.points.minByOrNull { it.y }!!
    val upperSide: Point get() = hitbox.points.maxByOrNull { it.y }!!
}
