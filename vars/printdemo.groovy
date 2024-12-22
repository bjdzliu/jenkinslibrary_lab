// 在 Jenkins 共享库的文件中定义一个名为 'call' 的方法
def call(Map config) {
    // 打印传入的配置
    echo "Hello, ${config.name}! Welcome to Jenkins Pipeline."
    echo "Job URL: ${config.url}"
    echo "Build Number: ${config.buildNumber}"
    initialize(this)

}

def initialize(obj){
    steps=obj
    println(steps.env.folderName)
}

