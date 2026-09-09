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
| <img width="250" height="500" alt="Image" src="https://github.com/user-attachments/assets/cf5ac650-2c6a-41a9-84d9-930da0c8299b" /> | <img width="250" height="500" alt="Image" src="https://github.com/user-attachments/assets/90f16b89-377c-4232-8757-b3832c402b44" /> |

| Consumo em Litros | Distância em KM |
|:---:|:---:|
| <img width="250" height="500" alt="Image" src="https://github.com/user-attachments/assets/71c173f6-2e2d-49c0-8297-b01c723d86f8" /> | <img width="1280" height="2856" alt="Image" src="https://github.com/user-attachments/assets/87606735-d3d8-4102-b8b7-2708a7961118" /> |

| Preço do Combustível | Resultado |
|:---:|:---:|
| <img width="250" height="500" alt="Image" src="https://github.com/user-attachments/assets/a170f939-d2a7-4ba3-84f1-93aad5cab6bc" /> | <img width="250" height="500" alt="Image" src="https://github.com/user-attachments/assets/38b0a26b-1788-4519-8437-d3dacfa605f8" /> |

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
