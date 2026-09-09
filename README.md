# ⛽ Calculadora de Gasto de Combustível

Aplicativo Android nativo, desenvolvido em **Kotlin** com **XML** no **Android Studio**, que ajuda o usuário a calcular quanto vai gastar de combustível em uma viagem, a partir da distância percorrida, do consumo do veículo e do preço do litro do combustível.

> Não sabe quanto vai gastar de combustível? Não se preocupe, o app calcula para você! 🚗💨

---

## 📱 Sobre o projeto

O app guia o usuário por um fluxo simples de telas, coletando os dados necessários para o cálculo:

1. **Tela de Splash** — tela inicial de carregamento do app.
2. **Tela de boas-vindas** — apresenta a proposta do app.
3. **Consumo de combustível** — o usuário informa o consumo do veículo (em litros).
4. **Distância em KM** — o usuário informa a distância a ser percorrida.
5. **Preço do combustível** — o usuário informa o preço do litro do combustível (em reais).
6. **Resultado** — exibe o resumo do cálculo e o gasto total estimado.

### Fórmula utilizada

```
Gasto Total = Consumo (L) × Preço do Litro (R$)
```

---

## 🖼️ Telas do aplicativo

| Splash | Boas-vindas |
|:---:|:---:|
| <img width="250" height="400" alt="Image" src="https://github.com/user-attachments/assets/cf5ac650-2c6a-41a9-84d9-930da0c8299b" /> | <img src="screenshots/home.png" width="250"/> |

| Consumo em Litros | Distância em KM |
|:---:|:---:|
| <img src="screenshots/consumo_em_litros.png" width="250"/> | <img src="screenshots/distancia_em_km.png" width="250"/> |

| Preço do Combustível | Resultado |
|:---:|:---:|
| <img src="screenshots/preco_combustivel.png" width="250"/> | <img src="screenshots/resultado.png" width="250"/> |

---

## 🛠️ Tecnologias utilizadas

- [Kotlin](https://kotlinlang.org/) — linguagem principal de desenvolvimento
- [XML](https://developer.android.com/develop/ui/views/layout/declaring-layout) — construção das interfaces (layouts)
- [Android Studio](https://developer.android.com/studio) — IDE oficial para desenvolvimento Android
- Android SDK (Views tradicionais)

---

## 📂 Estrutura do projeto

```
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/.../        # Classes Kotlin (Activities, lógica de cálculo)
│   │   │   ├── res/
│   │   │   │   ├── layout/      # Arquivos XML de layout (telas)
│   │   │   │   ├── drawable/    # Ícones e ilustrações
│   │   │   │   ├── values/      # Cores, strings, temas
│   │   │   └── AndroidManifest.xml
├── screenshots/                 # Imagens usadas neste README
├── build.gradle
└── README.md
```

---

## ▶️ Como executar o projeto

### Pré-requisitos

- [Android Studio](https://developer.android.com/studio) instalado (versão recomendada: Hedgehog ou superior)
- JDK 17 ou superior
- Um emulador Android configurado ou um dispositivo físico com depuração USB ativada

### Passo a passo

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Abra o projeto no **Android Studio**.
3. Aguarde a sincronização do Gradle.
4. Conecte um dispositivo físico ou inicie um emulador.
5. Clique em **Run ▶️** para instalar e executar o aplicativo.

---

## 🚀 Funcionalidades

- ✅ Cálculo automático do gasto total de combustível
- ✅ Interface simples e intuitiva
- ✅ Fluxo de telas guiado (passo a passo)
- ✅ Resumo detalhado do cálculo (distância, consumo e preço do litro)

---

## 📌 Roadmap / Melhorias futuras

- [ ] Histórico de cálculos realizados
- [ ] Suporte a múltiplos veículos
- [ ] Modo escuro (Dark Mode)
- [ ] Conversão automática de moeda
- [ ] Testes unitários e de UI

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/minha-feature`)
3. Faça o commit das suas alterações (`git commit -m 'Adiciona minha feature'`)
4. Faça o push para a branch (`git push origin feature/minha-feature`)
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👤 Autor

Desenvolvido com 💜 por **[Seu Nome]**

- GitHub: [@seu-usuario](https://github.com/seu-usuario)
- LinkedIn: [Seu Nome](https://linkedin.com/in/seu-usuario)
