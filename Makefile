# Diretório onde os .class compilados serão colocados
BIN_DIR = bin

# Alvo para compilar
compile:
	@if [ -z "$(FILE)" ]; then \
		echo "Erro: use make run FILE=caminho/Classe.java"; exit 1; \
	fi; \
	mkdir -p $(BIN_DIR); \
	javac -d $(BIN_DIR) $(FILE)

# Alvo para compilar e rodar
run: compile
	@if [ -z "$(FILE)" ]; then \
		echo "Erro: use make run FILE=caminho/Classe.java"; exit 1; \
	fi; \
	package=$$(grep -E '^package ' $(FILE) | sed 's/package \(.*\);/\1/'); \
	classname=$$(basename $(FILE) .java); \
	if [ -n "$$package" ]; then \
		fullclass="$$package.$$classname"; \
	else \
		fullclass="$$classname"; \
	fi; \
	java -cp $(BIN_DIR) $$fullclass

# Alvo para limpar os compilados
clean:
	rm -rf $(BIN_DIR)
