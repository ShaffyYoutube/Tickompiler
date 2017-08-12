package rhmodding.tickompiler

val VERSION: String = "v1.5.0-SNAPSHOT"

val GITHUB: String = "https://github.com/SneakySpook/Tickompiler"

interface TickompilerError

open class CompilerError(message: String) : RuntimeException(message), TickompilerError

open class DecompilerError(message: String) : RuntimeException(message), TickompilerError

class MissingFunctionError(message: String) : CompilerError(message)

class WrongArgumentsError(args: Long, needed: IntRange, msg: String = "") : CompilerError(
        "Wrong arg count: got $args, need $needed - $msg")
