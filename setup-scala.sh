#!/bin/bash

# Scala Setup Script for Git Bash
# This script configures Java 25 and Scala CLI for development

echo "=== Scala Environment Setup ==="
echo

# Set Java home
export JAVA_HOME="/c/Users/gamba/.jdks/corretto-25.0.1"
export PATH="$JAVA_HOME/bin:$PATH"

# Add scala-cli to PATH (installed via Winget)
export PATH="/c/Program Files/scala-cli-x86_64-pc-win32:$PATH"

echo "1. Checking Java installation..."
if ! command -v java &> /dev/null; then
    echo "ERROR: Java not found at $JAVA_HOME"
    exit 1
fi
java -version
echo

echo "2. Checking Scala CLI installation..."
if ! command -v scala-cli &> /dev/null; then
    echo "ERROR: scala-cli not found in PATH"
    exit 1
fi
scala-cli version
echo

echo "3. Checking default Scala version..."
scala-cli version --scala
echo

echo "4. Testing Scala with a simple program..."
cat > hello.scala << 'SCALA_CODE'
object Main:
  def main(args: Array[String]): Unit =
    println("✓ Scala setup successful!")
SCALA_CODE

scala-cli run hello.scala
rm -f hello.scala

echo
echo "=== Setup Complete ==="
echo "Your Scala environment is ready to use!"
echo "Java Home: $JAVA_HOME"
echo "Java Version: $(java -version 2>&1 | head -1)"
