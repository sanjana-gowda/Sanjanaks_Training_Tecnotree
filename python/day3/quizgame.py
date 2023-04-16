import random

# Define the quiz questions
questions = [
    {
        "question": "What is the capital of France?",
        "options": ["A. Paris", "B. Madrid", "C. Berlin", "D. Rome"],
        "answer": "A"
    },
    {
        "question": "What is the largest mammal in the world?",
        "options": ["A. Elephant", "B. Lion", "C. Blue Whale", "D. Giraffe"],
        "answer": "C"
    },
    {
        "question": "What is the highest mountain in the world?",
        "options": ["A. Mount Everest", "B. K2", "C. Kangchenjunga", "D. Lhotse"],
        "answer": "A"
    },
    {
        "question": "What is the smallest country in the world?",
        "options": ["A. Monaco", "B. Liechtenstein", "C. San Marino", "D. Vatican City"],
        "answer": "D"
    },
    {
        "question": "What is the largest continent in the world?",
        "options": ["A. Africa", "B. Asia", "C. North America", "D. Europe"],
        "answer": "B"
    }
]

# Shuffle the questions
random.shuffle(questions)

# Initialize the score
score = 0

# Iterate over the questions
for i, q in enumerate(questions):
    print(f"Question {i+1}: {q['question']}")
    for option in q['options']:
        print(option)
    # Prompt the user for their answer
    user_answer = input("Your answer (A/B/C/D): ").upper()
    # Check the user's answer and update the score
    if user_answer == q['answer']:
        print("Correct!")
        score += 1
    else:
        print(f"Incorrect. The correct answer is {q['answer']}.")
    print()

# Display the final score
print(f"Your final score is {score}/{len(questions)}")
