def call() {
    withPythonEnv('/usr/bin/python3.9') {
    sh """
    pip install setuptools wheel
    pip install -r .jenkins/requirements/execute_job_requirements.txt
    pip install promptflow promptflow-tools promptflow-sdk jinja2 promptflow[azure] openai promptflow-sdk[builtins]
    """
    }
}