# Hello Java - Pefisa/PNB - branch teste 2

Aplicação Java simples com Spring Boot, desenvolvida para testar o fluxo de build, deploy e publicação das aplicações da **Pefisa/PNB** utilizando GitHub Actions, Google Artifact Registry e Kubernetes com GitOps.

## 🔥 Objetivo

Validar o ciclo completo de:

- Build da aplicação
- Geração da imagem Docker
- Publicação no Google Artifact Registry (GCP)
- Atualização automática dos manifests Kubernetes (GitOps)

## 🚀 Tecnologias Utilizadas

- Java 17 (Spring Boot)
- Maven
- Docker
- GitHub Actions (CI/CD)
- Google Cloud Artifact Registry
- Kubernetes + Kustomize (GitOps)

## 🏗️ Estrutura do Projeto

```plaintext
.
├── .github/workflows
│   └── build-and-deploy.yaml     # Pipeline CI/CD
├── manifests                     # Manifests Kubernetes
│   ├── deployment.yaml
│   ├── service.yaml
│   └── kustomization.yaml
├── src
│   └── main/java/com/example/demo
│       └── DemoApplication.java  # Aplicação Hello World
├── Dockerfile                    # Dockerfile da aplicação
├── pom.xml                       # Configuração Maven
└── README.md                     # Este arquivo
```

## ⚙️ Pipeline CI/CD

O fluxo de CI/CD realiza os seguintes passos automaticamente:

1. Faz o build da aplicação Java via Maven (`mvn clean package`).
2. Cria a imagem Docker.
3. Faz push da imagem para o Google Artifact Registry.
4. Atualiza o manifest `deployment.yaml` com a nova imagem.
5. Faz commit e push da alteração dos manifests no próprio repositório.

## 🌐 Endpoints da Aplicação

| Método | Endpoint | Descrição       |
|--------|----------|-----------------|
| GET    | `/`      | Hello World API |

## 🏗️ Deploy no Kubernetes

O deploy é gerenciado através dos manifests em `manifests/` e pode ser aplicado manualmente com:

```bash
kubectl apply -k manifests/
```

Ou através de um operador GitOps (ex.: ArgoCD) que monitora esse repositório.

## 🔐 Secrets Necessários no GitHub Actions

No repositório do GitHub, configure os seguintes secrets:

| Nome             | Descrição                                    |
|------------------|----------------------------------------------|
| `GCP_PROJECT_ID` | ID do projeto no Google Cloud                |
| `GCP_SA_KEY`     | JSON da Service Account com permissões de push no Artifact Registry e acesso ao cluster Kubernetes |

## 🐳 Build Manual (Opcional)

```bash
mvn clean package -DskipTests
docker build -t hello-java .
```

## ☁️ Push Manual para GCP (Opcional)

```bash
gcloud auth configure-docker REGION-docker.pkg.dev
docker tag hello-java REGION-docker.pkg.dev/PROJECT_ID/REPOSITORY/hello-java:latest
docker push REGION-docker.pkg.dev/PROJECT_ID/REPOSITORY/hello-java:latest
```

## ✍️ Observação

Este projeto é exclusivamente para fins de teste e validação dos fluxos de publicação, deploy e automação das aplicações da **Pefisa/PNB**.

---

## 💼 Feito por

Time de Engenharia | Pefisa / PNB