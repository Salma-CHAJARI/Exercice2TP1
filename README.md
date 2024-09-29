# Calculateur d'Impôts Locaux

## Description

L'application mobile a pour objectif de calculer les impôts locaux d’un véhicule en fonction de plusieurs critères. Elle prend en compte deux éléments pour le calcul :

- **Impôt de base** : Calculé en multipliant la surface par 2.
- **Impôt supplémentaire** : Calculé comme suit :
  - \( \text{Impôt Supplémentaire} = \text{nombre de pièces} \times 50 + (100 \text{ si une piscine est présente}) \)

## Fonctionnalités Principales

- **Saisie des Informations** : 
  - L’utilisateur saisit la surface, le nombre de pièces, et coche une option s’il dispose d’une piscine.
  
- **Calcul Automatique des Impôts** : 
  - L’application calcule automatiquement le montant total des impôts en fonction des données saisies et l’affiche à l’écran.

- **Validation des Champs** : 
  - L'application vérifie que le champ surface est valide avant de procéder au calcul du résultat.

## Objectif

L'objectif de ce projet est de réaliser des calculs et d'afficher les données après avoir effectué un clic, tout en prenant en compte des conditions déjà définies.

## Écrans

- **Écran d'Habitation** : Représenté dans la figure 1.5, cet écran permet à l'utilisateur de saisir les informations nécessaires.
- **Vérification du Champ Surface** : Représenté dans la figure 1.6, cet écran montre la vérification du champ surface avant de calculer le résultat.

## Prérequis

- Android Studio
- Java Development Kit (JDK)
- Fichiers XML nécessaires pour la mise en page, incluant :
  - `activity_main.xml` (pour l'interface principale)

## Installation

1. Cloner ce dépôt :
   ```bash
   git clone <https://github.com/Salma-CHAJARI/Exercice2TP1.git>
2. Ouvrez le projet dans *Android Studio*.
3. Compilez et lancez l'application sur un émulateur ou un appareil Android.
## *Exécution*
1. Remplir les champs surtout la surface et le nombre de pièces.
2. Cochez la case de *"piscine"* si il y a un piscine.
3. Cliquer sur le button de *"Calculer"*.
   
## *Auteur*

Développé par *CHAJARI Salma* dans le cadre d'un exercice de développement d'applications Android.
## *Licence*

Ce projet est sous licence *MIT*. Voir le fichier LICENSE pour plus de détails.


https://github.com/user-attachments/assets/a3ec7bc4-fde1-4e88-bf69-dcd8bb1d8b28

