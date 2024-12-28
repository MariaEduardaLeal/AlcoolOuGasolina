
# Álcool ou Gasolina?

Este é um aplicativo simples desenvolvido em Kotlin utilizando Jetpack Compose que ajuda os usuários a decidir qual combustível é mais vantajoso economicamente: **Álcool** ou **Gasolina**.

## 📱 Funcionalidades

- **Entrada de dados**: Permite ao usuário inserir os preços do álcool e da gasolina.
- **Cálculo automático**: Com base nos valores fornecidos, o aplicativo calcula qual combustível é mais vantajoso, considerando a fórmula padrão:
  - **Álcool é mais vantajoso se o preço for menor que 70% do preço da gasolina.**
- **Interface amigável**: Design simples e limpo, utilizando Jetpack Compose.

## 🛠️ Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação principal.
- **Jetpack Compose**: Framework moderno para criar interfaces declarativas no Android.
- **Material Design 3**: Componentes modernos para UI/UX.

## 🎨 Layout

- Tela com um fundo roxo para destacar os componentes.
- Textos com estilos personalizados para melhor visualização.
- Inputs para os valores de gasolina e álcool, com teclado numérico para maior precisão.

## 🚀 Como Executar

1. Certifique-se de ter o **Android Studio** configurado em seu computador.
2. Clone este repositório:
   ```bash
   git clone https://github.com/MariaEduardaLeal/AlcoolOuGasolina.git
   ```
3. Abra o projeto no Android Studio.
4. Conecte um dispositivo Android ou configure um emulador.
5. Compile e execute o aplicativo.

## 🧮 Lógica do Aplicativo

A lógica é baseada na fórmula:
```text
Vantajoso usar álcool se:
(preço do álcool / preço da gasolina) <= 0.7
```

### Exemplo
- Preço do álcool: **R$ 4,00**
- Preço da gasolina: **R$ 6,00**

Cálculo:  
`4.00 / 6.00 = 0.6666`  
**Resultado:** Use **Álcool**.

## 📸 Capturas de Tela

(Adicione capturas de tela aqui, se desejar.)

## 📋 Observações

- **Compatibilidade:** Este projeto foi desenvolvido e testado para versões recentes do Android.
- **Contribuição:** Sugestões e melhorias são bem-vindas!

## 🧑‍💻 Autora

Desenvolvido por **Maria Eduarda Leal**.

[![GitHub](https://img.shields.io/badge/GitHub-MariaEduardaLeal-black?style=flat-square&logo=github)](https://github.com/MariaEduardaLeal)
