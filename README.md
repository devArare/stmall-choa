
1. 도메인 주제: 
1-1. 시나리오: 렌트카, 영화예매, ....
- ㅇㅇㅇ
- ㅇㅇㅇ
(*시나리오 세개이상, 바운디드 컨텍스트 3개이상 )

2. 이벤트스토밍 모델
(*이미지첨부)
![image](https://github.com/devArare/stmall-choa/assets/135335032/892b5f91-9180-41bb-ae5d-ebdfe87c8098)


# 

## Model
www.msaez.io/#/courses/cna-full/8985ef50-79e2-11ee-a073-c7d5e815611c/design-event

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- order
- delivery
- Stock


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- order
```
 http :8088/orders id="id" userId="userId" productName="productName" productId="productId" qty="qty" status="status" orderDt="orderDt" address="address" 
```
- delivery
```
 http :8088/deliveryMgmts id="id" userId="userId" oderId="oderId" productName="productName" productId="productId" qty="qty" status="status" deliveryDt="deliveryDt" 
```
- Stock
```
 http :8088/inventories id="id" productName="productName" productImg="productImg" stock="stock" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

