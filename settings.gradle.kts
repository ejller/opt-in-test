
rootProject.name = "java-kotlin"
include("src:main:one")
findProject(":src:main:one")?.name = "one"
include("src:main:three")
findProject(":src:main:three")?.name = "three"
