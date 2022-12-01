fun loadResource(resourcePath: String): String =
    object {}.javaClass.getResource(resourcePath)?.readText() ?: throw IllegalArgumentException("Can't find file")