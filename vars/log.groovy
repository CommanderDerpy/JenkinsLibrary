def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def release() {
    booleanParam(name: 'RELEASE', defaultValue: false, description: 'Whether to release the project or not. (Implies version increase) - Default: false.')
}
