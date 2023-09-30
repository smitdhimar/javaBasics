{ pkgs }: {
    deps = [
        pkgs.adoptopenjdk-openj9-bin-8
        pkgs.adoptopenjdk-hotspot-bin-8
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}