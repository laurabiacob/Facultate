def arithmetic_arranger(problems, show_answers=False):
    arranged_problems = ""
    first_line = ""
    second_line = ""
    dashes_line = ""
    answers_line = ""
    if len(problems) > 5:
        return "Error: Too many problems."
    for problem in problems:
        operand1, operator, operand2 = problem.split()

        if operator not in ['+', '-']:
            return "Error: Operator must be '+' or '-'."

        if not (operand1.isdigit() and operand2.isdigit()):
            return "Error: Numbers must only contain digits."

        if len(operand1) > 4 or len(operand2) > 4:
            return "Error: Numbers cannot be more than four digits."

        max_length = max(len(operand1), len(operand2))
        width = max_length + 2

        first_line += operand1.rjust(width) + "    "
        second_line += operator + operand2.rjust(width - 1) + "    "
        dashes_line += "-" * width + "    "

        if show_answers:
            if operator == "+":
                answer = str(int(operand1) + int(operand2))
            else:
                answer = str(int(operand1) - int(operand2))
            answers_line += answer.rjust(width) + "    "

    arranged_problems += first_line.rstrip() + "\n"
    arranged_problems += second_line.rstrip() + "\n"
    arranged_problems += dashes_line.rstrip()

    if show_answers:
        arranged_problems += "\n" + answers_line.rstrip()

    return arranged_problems
problems = ["32 + 698", "3801 - 2", "45 + 43", "123 + 49"]
print(arithmetic_arranger(problems))
