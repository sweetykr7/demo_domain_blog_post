rootProject.name = "demo_domain_blog_post"

val services = "${rootProject.projectDir}/services"

apply(from = "monolith/monolith.settings.gradle.kts")
apply(from = "$services/post/post.settings.gradle.kts")

