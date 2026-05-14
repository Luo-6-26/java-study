# AL智能体前后端分离项目结构

此仓库为主动学习（Active Learning）智能体的多层架构项目示范。

## 总体结构

```
al-active-learning-system/
├── backend/           # Java后端（Spring Boot + Weka）
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── yourorg/
│   │                   ├── al/
│   │                   │   ├── ALAgentService.java
│   │                   │   ├── ALController.java
│   │                   │   └── model/
│   │                   │       ├── SampleWithId.java
│   │                   │       └── LabelDTO.java
│   │                   └── Application.java
│   ├── data/           # 存放训练与标注数据集
│   ├── model/          # 可选：模型持久化文件
│   ├── pom.xml         # Maven依赖文件
│   └── README.md
├── frontend/           # 前端应用（如React或Vue）
│   ├─�� src/
│   │   └── ...
│   ├── package.json
│   ├── public/
│   └── README.md
└── README.md           # 仓库总体说明
```

## 说明

- backend/：Java主动学习与REST API服务实现
- frontend/：交互式标注与主动确认前端界面
- data/：数据集和标注结果存放
- model/：模型持久化（可选，如需断点续接训练）

后续可根据实际业务需求在各模块下逐步完善核心代码、文档与数据。
