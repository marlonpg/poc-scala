# Scala Development Setup

## Prerequisites

Ensure **Java 21+** is installed:

```bash
java -version
```

## Installation

### Ubuntu/Debian

```bash
curl -fL https://github.com/VirtusLab/scala-cli/releases/latest/download/scala-cli-x86_64-pc-linux.gz | \
gzip -d > scala-cli && chmod +x scala-cli && sudo mv scala-cli /usr/local/bin/
```

Or via package manager:

```bash
sudo apt install scala-cli
```

### macOS (Homebrew)

```bash
brew install scala-cli
```

### Fedora/RHEL

```bash
sudo dnf install scala-cli
```

## Verify Installation

```bash
scala-cli version
scala-cli version --scala
```

## Quick Start

### Run a Scala File

```bash
cat > hello.scala << 'EOF'
object Main:
  def main(args: Array[String]): Unit =
    println("Hello, Scala!")
EOF

scala-cli run hello.scala
```

### Create a Project

```bash
scala-cli init my-project
cd my-project
scala-cli run
```

### Compile to JAR

```bash
scala-cli package hello.scala -o hello.jar
java -jar hello.jar
```

### REPL

```bash
scala-cli repl
```

## Resources

- [Scala Docs](https://docs.scala-lang.org)
- [Scala 3 Book](https://docs.scala-lang.org/scala3/book/introduction.html)
- [Scala CLI Docs](https://scala-cli.virtuslab.org)
